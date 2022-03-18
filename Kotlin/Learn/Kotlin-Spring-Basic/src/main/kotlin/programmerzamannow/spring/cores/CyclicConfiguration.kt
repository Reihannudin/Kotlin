package programmerzamannow.spring.cores

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import programmerzamannow.spring.cores.Cyclic.CyclicA
import programmerzamannow.spring.cores.Cyclic.CyclicB
import programmerzamannow.spring.cores.Cyclic.CyclicC

//add configuration
@Configuration
class CyclicConfiguration {

// Don't ever do it Circular dependency
//    This is happening Circular dependency bcs every function (Class) is calling another function(class)

//    make Bean CyclicA
    @Bean
    fun CyclicA(cyclicB : CyclicB): CyclicA { //cyclicA need CyclicB, add cyclicB to parameter
        return CyclicA(cyclicB) // return CyclicA and add CyclicB in CyclicA
    }

//    make bean  CyclicB
    @Bean
    fun CyclicB(cyclicC: CyclicC): CyclicB { //cyclicB need CyclicC, add cyclicC to parameter
        return CyclicB(cyclicC) // return CyclicB and add cyclicC in CyclicB
    }

//    make bean CyclicC
    @Bean
    fun CyclicC(cyclicA: CyclicA): CyclicC { //cyclicC need CyclicA, add cyclicA to parameter
        return CyclicC(cyclicA) // return CyclicC and add cyclicA in CyclicC
    }
}
