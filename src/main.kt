fun main() {
//    val stack = classeGenerics(0.62, 3.14, 2.7)
//    val arrayNum = arrayOf(1,2,3,4)

    var arraySimple = Array(8, { i -> i * 1 })
    var array = ArrayCopy(arraySimple)

    var arrayModificato = modificaArray(array)


    for (i in arrayModificato.indices) {
        println("${arrayModificato[i]}")
    }

//    val num = arrayOf<Int>(1, 2, 3, 4, 5)
//    num.set(0, 10)
//    num.set(1, 6)
//    for (i in num.indices) {
//        println(num[i])
//    }

}

