package programmerzamannow.spring.cores

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import programmerzamannow.spring.cores.factory.PaymentGateawayClientFactoryBean

@Configuration
@Import(PaymentGateawayClientFactoryBean::class)
class FactoryConfiguration {
}