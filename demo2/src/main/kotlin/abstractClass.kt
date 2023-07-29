abstract class AbstractClass(
    val name: String
) {
    val a = 10
    abstract fun c()
    fun d() {}
}

class SomeClass: AbstractClass("SomeName") {
    val b = 20
    override fun c() {}
    fun e() {}
}
fun main(){
    val obj : SomeClass = SomeClass()
}