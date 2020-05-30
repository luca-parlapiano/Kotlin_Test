class Utils {
    companion object {
        fun <T> MostraValoriArray(array: Array<T>) {
            for (i in 0..array.size - 1) {
                println(array[i])
            }
        }

//        fun <T> attraversamentoArray (array:Array<T>){
//            for(i in array.indices){
//                println(array[i])
//            }
//        }
    }
}