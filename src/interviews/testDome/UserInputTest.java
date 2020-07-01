package interviews.testDome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputTest {
    private UserInput.TextInput textInput;
    private UserInput.NumericInput numericInput;

    @Test
    void TextInputShouldReturnConcatenationOfCharactersAdded(){
        textInput = new UserInput.TextInput();

        textInput.add('a');
        textInput.add('b');
        textInput.add('e');
        textInput.add('g');
        assertEquals("abeg",textInput.getValue());
    }

    @Test
    void NumericInputShouldReturnConcatenationOfCharactersAddedExcludingNonNumericCharacters(){
        numericInput = new UserInput.NumericInput();

        numericInput.add('1');
        numericInput.add('a');
        numericInput.add('0');
        assertEquals("10",numericInput.getValue());
    }
}
