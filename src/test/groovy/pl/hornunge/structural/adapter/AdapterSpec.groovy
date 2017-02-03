package pl.hornunge.structural.adapter

import pl.hornunge.structural.adapter.adapter.EnumIntComparatorObjectAdapter
import spock.lang.Specification

class AdapterSpec extends Specification {
    def 'asd'() {
        given:
            List<Integer> integerList = [4,5,1,3,2]
        when:
            Collections.sort(integerList, new EnumIntComparatorObjectAdapter())
        then:
            integerList == [1,2,3,4,5]
    }
}
