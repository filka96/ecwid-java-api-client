package com.ecwid.apiclient.v3.dto.variation.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.impl.RequestInfo

data class DeleteAllProductVariationsRequest(
	val productId: Int = 0
) : ApiRequest {
	override fun toRequestInfo() = RequestInfo.createDeleteRequest(
		pathSegments = listOf(
			"products",
			"$productId",
			"combinations"
		)
	)
}
