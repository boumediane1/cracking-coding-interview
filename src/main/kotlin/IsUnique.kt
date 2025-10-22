fun isUnique(s: String): Boolean {
    val letters = Array(256) { 0 }

    for (c in s) {
        val index = c.code

        letters[index]++

        if (letters[index] > 1) {
            return false
        }
    }

    return true
}
