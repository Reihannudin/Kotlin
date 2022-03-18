package programmerzamannow.spring.cores

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import programmerzamannow.spring.cores.configuration.BarConfiguration
import programmerzamannow.spring.cores.configuration.FooConfiguration


// Set configuration
@Configuration
//import configuration
@Import(value = [
    FooConfiguration::class, //import FooConfiguration
    BarConfiguration::class //import BarConfiguration
])
class MainConfiguration {
}