package javaPro.homework_All.homework_2024_02_19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ComplexOperationsServiceTest {

    private final ComplexOperationsService service = new ComplexOperationsService();

    @ParameterizedTest
    @CsvSource({"weak, false", "strongPassword1@, true", "noDigit!, false", "NoSpecialChar1, false"})
    void validatePasswordStrengthTest(String password, boolean isValid) {
        if (!isValid) {
            assertThrows(IllegalArgumentException.class, () -> service.validatePasswordStrength(password));
        } else {
            assertDoesNotThrow(() -> service.validatePasswordStrength(password));
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"qwerasdf", "987654po", " vbnh"})
    void validatePasswordStrengthWhithExceptionTest(String password) {
        assertThrows(IllegalArgumentException.class, () -> service.validatePasswordStrength(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ygtrfd!1233A", "1TTR5&234hj", "432!23fUuyg"})
    void validatePasswordStrengthWhithoutExceptionTest(String password) {
        assertDoesNotThrow(() -> service.validatePasswordStrength(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"This is correct", "This text contains error", "fail is not good", "wrong way"})
    void processTextTest(String text) {
        if (text.contains("error") || text.contains("fail") || text.contains("wrong")) {
            assertThrows(IllegalArgumentException.class, () -> service.processText(text));
        } else {
            assertDoesNotThrow(() -> service.processText(text));
        }
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "one,two,three", "10,,20", "5.5,6.5"})
    void sumOfNumbersInStringTest(String numbers) {
        if (numbers.matches(".*[a-zA-Z]+.*") || numbers.contains(",,")) {
            assertThrows(IllegalArgumentException.class, () -> service.sumOfNumbersInString(numbers));
        } else {
            assertDoesNotThrow(() -> service.sumOfNumbersInString(numbers));
        }
    }

    @ParameterizedTest
    @CsvSource({"'1,2,3,4', true", "'This text, 4 contains error', false", "'2,4,5,6,7,7,0', true", "'3,4,5,6,6,5', true"})
    void sumOfNumbersInStringTest(String text, boolean isCorrect) {
        if (!isCorrect) {
            assertThrows(IllegalArgumentException.class, () -> service.sumOfNumbersInString(text));
        } else {
            assertDoesNotThrow(() -> service.sumOfNumbersInString(text));
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"http://valid.com", "https://valid.com", "ftp://invalid.com", "justtext"})
    void validateUrlFormatTest(String url) {
        if (!url.startsWith("http")) {
            assertThrows(IllegalArgumentException.class, () -> service.validateUrlFormat(url));
        } else {
            assertDoesNotThrow(() -> service.validateUrlFormat(url));
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"http://treuyt.com", "https://qwsa.ua"})
    void validateUrlFormatWithoutExceptionTest(String url) {
        assertDoesNotThrow(() -> service.validateUrlFormat(url));
    }

    @ParameterizedTest
    @ValueSource(strings = {"htt://treuyt.com", "https://qwsa"})
    void validateUrlFormatWithExceptionTest(String url) {
        assertThrows(IllegalArgumentException.class, () -> service.validateUrlFormat(url));
    }

    @ParameterizedTest
    @ValueSource(strings = {"http://example.com", "https://example.org", "http://subdomain.example.net", "https://example.co.uk"})
    void validateUrlFormatPositiveTest(String url) {
        if (url.matches("^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}.*$")) {
            assertDoesNotThrow(() -> service.validateUrlFormat(url));
        } else {
            assertThrows(IllegalArgumentException.class, () -> service.validateUrlFormat(url));
        }
    }

    public static Stream<Arguments> emailListProvider() {
        return Stream.of(Arguments.of(Arrays.asList("valid@email.com", "invalid-email"), false),
                Arguments.of(Arrays.asList("valid@email.com", "also.valid@email.com"), true));
    }

    @ParameterizedTest
    @MethodSource("emailListProvider")
    void checkEmailListConsistencyTest(List<String> emails, boolean isValid) {
        if (!isValid) {
            assertThrows(IllegalArgumentException.class, () -> service.checkEmailListConsistency(emails));
        } else {
            assertDoesNotThrow(() -> service.checkEmailListConsistency(emails));
        }
    }
    @ParameterizedTest
    @CsvSource({"Anna, true", "LeveL, true", "Point, false"})
    void checkStringPalindromeTest(String word, boolean isPalindrome) {
        if (!isPalindrome) {
            assertThrows(IllegalArgumentException.class, () -> service.checkStringPalindrome(word));
        } else {
            System.out.println("Is Palindrome");
        }
    }

    @Test
    void validateIdentificationNumberTest() {
        assertDoesNotThrow(() -> service.validateIdentificationNumber("AB123456"));
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> service.validateIdentificationNumber("AB12345"));
        assertEquals("Identification number format is invalid.", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> service.validateIdentificationNumber("ABCD1234"));
        assertEquals("Identification number format is invalid.", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> service.validateIdentificationNumber("AB1234567"));
        assertEquals("Identification number format is invalid.", exception.getMessage());
    }

    @ParameterizedTest
    @MethodSource("checkSumArguments")
    void checkSumOfListAgainstThresholdTest(List<Integer> numbers, int threshold, boolean expected) {
        boolean result = service.checkSumOfListAgainstThreshold(numbers, threshold);
        assertEquals(expected, result);
    }
    public static Stream<Arguments> checkSumArguments() {
        return Stream.of(Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), 10, true),
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), 10, true));
    }

    @ParameterizedTest
    @ValueSource(strings = {"192.168.0.1", "255.255.255.255", "10.0.0.123"})
    void validateIPAddressTest(String ipAddress) {
        if (!ipAddress.matches("^([0-9]{1,3}\\.){3}[0-9]{1,3}$")) {
            assertThrows(IllegalArgumentException.class, () -> service.validateIPAddress(ipAddress));
        } else {
            assertDoesNotThrow(() -> service.validateIPAddress(ipAddress));
        }
    }

    @Test
    void ensureNoDuplicateEntriesWhithoutDuplicateTest() {
        List<String> noDuplicates = Arrays.asList("apple", "banana", "orange");
        assertDoesNotThrow(() -> service.ensureNoDuplicateEntries(noDuplicates));
    }

    @Test
    void ensureNoDuplicateEntriesWhithDuplicateTest() {
        List<String> withDuplicates = Arrays.asList("apple", "banana", "apple");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> service.ensureNoDuplicateEntries(withDuplicates));
        assertEquals("List contains duplicate entries.", exception.getMessage());
    }

    @Test
    void ensureNoDuplicateEntriesCheckingEmptyListTest() {
        List<String> emptyList = Arrays.asList();
        assertDoesNotThrow(() -> service.ensureNoDuplicateEntries(emptyList));
    }
}
