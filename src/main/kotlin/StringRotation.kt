fun stringRotation(s1: String, s2: String): Boolean {
    if (s1.length == s2.length) {
        return "$s2$s2".contains(s1)
    }

    return false
}
