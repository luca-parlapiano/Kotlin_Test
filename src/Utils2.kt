fun <T> MostraValoriArray(array: Array<T>) {
    for (i in 0..array.size - 1) {
        println(array[i])
    }
}

fun ArrayCopy(array: Array<Int>): Array<Int> {
    val arrayVuoto = array.copyOf()
    return arrayVuoto
}

fun modificaArray(array: Array<Int>) :MutableList<String>{
    var arrayString: MutableList<String> = mutableListOf()

    //Kotlin like java has fixed size array, you can’t increase its size once it is created.
    //You should use MutableList instead.
    for (i in array.indices) {
         arrayString.add("dada ${array[i]}")
    }
    return arrayString
}


