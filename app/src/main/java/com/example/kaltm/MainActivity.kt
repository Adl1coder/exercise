
open class Araba(val marka: String) {

    fun hareketEt() {
        println("$marka arabamız hareket ediyor")
    }
}

class MercedesBenz(marka: String, val model: String) : Araba(marka) {

    fun otomatikPark() {
        println("$model otomatik park özelliğine sahip")
    }
}

class Audi(marka: String, val yil: Int) : Araba(marka) {

    fun sporModu() {
        println("$marka, $yil modelimizi spor moduna alalım")
    }
}

fun main() {

    var deger=false

    deger = ((10 < 10) && (30 < 40) || (2 == 4) || 5 < 30)
    println(deger)


    deger = ((10 < 10) && (30 < 40)) || ((2 == 4) || 5 < 30)
    println(deger)

    deger = ((10 < 10)) && (30 < 40) || (2 == 4) || 5 < 30

    println(deger)
    deger = (10 < 10) && ((30 < 40) || (2 == 4) || 5 < 30)
    println(deger)

    deger = (10 < 10 && 30 < 40) || ((2 == 4) || 5 < 30)
println(deger)

}
