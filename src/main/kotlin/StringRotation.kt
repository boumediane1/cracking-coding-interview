fun stringRotation(s1: String, s2: String): Boolean {
    return "$s2$s2".contains(s1)
}
