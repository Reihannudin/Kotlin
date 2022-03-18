package programmerzamannow.spring.cores

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

//set configuration
@Configuration
// import with component scan
@ComponentScan(basePackages = ["programmerzamannow.spring.cores.configuration"])
class ScanConfiguration {
}