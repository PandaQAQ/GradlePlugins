package com.pandaq.plugins

class DownloadUtil {

    // 从 url 下载文件到 target
    static void download(def target, def url) {
        new File(target).withOutputStream { out ->
            out << new URL(url).openStream()
        }
    }
}