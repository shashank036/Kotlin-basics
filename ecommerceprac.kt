
enum class GadgetType {
    MOBILE, TV, PC
}

data class Product(
 var name:String,
 var desc:String? = null,
 var price:Int,
 var gtype: GadgetType
)

fun main() {
    var productsCatelog = mutableListOf(
        Product(name = "Iphone",desc="Iphone 14 Max Pro", price=100000,gtype= GadgetType.MOBILE),
        Product(name = "Imac",desc="Mac laptop M1", price=105000,gtype= GadgetType.PC),
        Product(name = "Samsung Galaxy ",desc="4gb ram 1 TB memory", price=50000,gtype= GadgetType.MOBILE),
        Product(name = "Samsung Smart OLED TV",desc="Cystral Clear high Defination Picture with dynamic Contrast", price=250000,gtype= GadgetType.TV)
    )
    productsCatelog.forEach { println("${it.name}  - ${it.price}  - ${it.gtype}") }

    val gadgetsproducts = productsCatelog.filter { it.price <100000 }
    println("You have ${gadgetsproducts.size} short price Product.")

    val groupProducts = productsCatelog.groupBy { it.gtype }
    groupProducts.forEach { (gtype, groupProducts) ->
        println("$gtype: ${groupProducts.size} products")
    }
}