package pl.hornunge.structural.decorator.line_reader

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class LowerCaseReaderSpec extends Specification {
    def '[#inputString] should be read as [#outputString] when reading char by char'() {
        given:
            Reader reader = new LowerCaseReader(new StringReader(inputString))
        when:
            StringBuilder stringBuilder = new StringBuilder()
            int character
            while ((character = reader.read()) != -1) {
                stringBuilder.append((char) character)
            }
        then:
            stringBuilder.toString() == outputString
        where:
            inputString              || outputString
            "This is a Test String." || "this is a test string."
            "this is a test string." || "this is a test string."
            "THIS IS A TEST STRING." || "this is a test string."
            ""                       || ""
            "A"                      || "a"
            " "                      || " "
    }

    //TODO: add test for reading with buffer of different sizes
}
