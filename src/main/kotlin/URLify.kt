fun urlify(url: String, trueLength: Int): String {
    val url = url.toCharArray()

    var spaces = 0

    for (i in 0 until trueLength) {
        if (url[i] == ' ') {
            spaces++
        }
    }

    for (i in trueLength - 1 downTo 0) {
        if (url[i] != ' ') {
            url[i + spaces * 2] = url[i]
        } else {
            spaces--
            url[i + spaces * 2] = '%'
            url[i + 1 + spaces * 2] = '2'
            url[i + 2 + spaces * 2] = '0'

            if (spaces == 0) break;
        }
    }

    return url.joinToString("").trim()
}
