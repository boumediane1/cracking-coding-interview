fun checkPermutation(a: String, b: String): Boolean {
    if (a.length != b.length) {
        return false
    }

    val m1 = mutableMapOf<Char, Int>()
    val m2 = mutableMapOf<Char, Int>()

    for (i in 0 until a.length) {
        m1[a[i]] = m1.getOrDefault(a[i], 0) + 1
        m2[b[i]] = m2.getOrDefault(b[i], 0) + 1
    }

    for (c in 'a' until 'z') {
        if (m1[c] != m2[c]) {
            return false
        }
    }

   return true
}