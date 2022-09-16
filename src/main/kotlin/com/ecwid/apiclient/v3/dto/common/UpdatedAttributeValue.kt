package com.ecwid.apiclient.v3.dto.common

import com.ecwid.apiclient.v3.dto.product.enums.AttributeValueAlias

interface UpdatedAttributeValue<T : UpdatedAttributeValue<T>> {
	val id: Int?
	val alias: AttributeValueAlias?
	val name: String?
	val value: String?

	fun cast(): T

}
