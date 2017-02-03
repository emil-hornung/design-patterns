package pl.hornunge.structural.bridge.shape

import pl.hornunge.structural.bridge.example1.drawing.V1Drawing
import pl.hornunge.structural.bridge.example1.drawing_program.DrawingProgram1
import pl.hornunge.structural.bridge.example1.drawing_program.DrawingProgram2
import pl.hornunge.structural.bridge.example1.shape.Circle
import spock.lang.Specification

class CircleSpec extends Specification {

    static final double SOME_X = 1.0
    static final double SOME_Y = 2.0
    static final double SOME_R = 3.0

    private dp1

    def setup() {
        GroovyMock(DrawingProgram1, global: true)
        GroovyMock(DrawingProgram2, global: true)
    }

    def 'Drawing circle for DrawingProgram1 should invoke DrawingProgram1'() {
        given:
            Circle circle = new Circle(new V1Drawing(), SOME_X, SOME_Y, SOME_R)
        when:
            circle.draw()
        then:
            1 * DrawingProgram1.drawACircle(_,_,_)
    }

    def 'asd'() {
        when:
            DrawingProgram1.drawACircle(1,2,3)
        then:
            1*dp1.drawACircle(_,_,_)
    }
}
