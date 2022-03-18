package programmerzamannow.spring.cores.data


import org.slf4j.LoggerFactory


//class FooBar define foo and bar
class FooBar(foo: Foo, bar: Bar) {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)
    //    make private constructor
    private val foo: Foo? = foo
    //    make private constructor
    private val bar: Bar? = bar

    //    make getter data foo
    fun getFoo(): Foo? {
        log.info("getFoo")
        return foo
    }

    //    make getter data bar
    fun getBar(): Bar?{
        log.info("getBar")
        return bar
    }
}