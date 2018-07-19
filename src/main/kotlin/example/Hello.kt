package example

import kotlinjs.common.JsObj

fun main(args: Array<String>) {
    chrome.runtime.sendMessage(JsObj(), null)
}
