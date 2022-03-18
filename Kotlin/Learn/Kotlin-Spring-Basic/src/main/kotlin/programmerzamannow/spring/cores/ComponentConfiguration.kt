package programmerzamannow.spring.cores

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import programmerzamannow.spring.cores.data.MultiFoo

// add Configuration
@Configuration
// add component scan
@ComponentScan(basePackages = [
    "programmerzamannow.spring.cores.service" ,
    "programmerzamannow.spring.cores.repository", // add base package
    "programmerzamannow.spring.cores.configuration"
])
//import
@Import(MultiFoo::class)

class ComponentConfiguration {
}