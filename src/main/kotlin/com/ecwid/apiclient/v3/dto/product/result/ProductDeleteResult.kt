package com.ecwid.apiclient.v3.dto.product.result

import com.ecwid.apiclient.v3.dto.common.ApiResultDTO

data class ProductDeleteResult(
	val deleteCount: Int = 0
) : ApiResultDTO
