fun isUnique(s: String): Boolean {
    val letters = Array(26) { 0 }

    for (c in s.lowercase()) {
        val index = c.code - 'a'.code

        letters[index]++

        if (letters[index] > 1) {
            return false
        }
    }

    return true
}
