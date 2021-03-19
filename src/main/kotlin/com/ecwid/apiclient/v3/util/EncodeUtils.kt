package com.ecwid.apiclient.v3.util

import java.net.URLEncoder

private val UTF_CHARSET = Charsets.UTF_8.toString()

internal fun buildQueryString(params: Map<String, String>): String {
	return if (params.isEmpty()) {
		""
	} else {
		params.entries.joinToString(prefix = "?", separator = "&") { (key, value) ->
			URLEncoder.encode(key, UTF_CHARSET) + "=" + URLEncoder.encode(value, UTF_CHARSET)
		}
	}
}

internal fun buildEndpointPath(pathSegments: List<String>): String {
	return pathSegments.joinToString(separator = "/") { component ->
		// We should use something like Guava's UrlEscapers.urlPathSegmentEscaper() here to escape url's path.
		// But Ecwid API backend decodes path segments as query parameters and not as url's path segments.
		// So we should do the same here to correctly encode spaces as "+" and not "%20"
		URLEncoder.encode(component, UTF_CHARSET)
	}
}
