package com.ecwid.apiclient.v3.rule.nullablepropertyrules

import com.ecwid.apiclient.v3.dto.product.result.FetchedProduct
import com.ecwid.apiclient.v3.rule.NullablePropertyRule
import com.ecwid.apiclient.v3.rule.NullablePropertyRule.AllowNullable
import com.ecwid.apiclient.v3.rule.NullablePropertyRule.IgnoreNullable

val fetchedProductNullablePropertyRules: List<NullablePropertyRule<*, *>> = listOf(
	IgnoreNullable(FetchedProduct::attributes),
	AllowNullable(FetchedProduct::borderInfo),
	IgnoreNullable(FetchedProduct::categories),
	IgnoreNullable(FetchedProduct::categoryIds),
	IgnoreNullable(FetchedProduct::combinations),
	IgnoreNullable(FetchedProduct::compareToPrice),
	IgnoreNullable(FetchedProduct::compareToPriceDiscount),
	IgnoreNullable(FetchedProduct::compareToPriceDiscountFormatted),
	IgnoreNullable(FetchedProduct::compareToPriceDiscountPercent),
	IgnoreNullable(FetchedProduct::compareToPriceDiscountPercentFormatted),
	IgnoreNullable(FetchedProduct::compareToPriceFormatted),
	AllowNullable(FetchedProduct::customsHsTariffCode),
	IgnoreNullable(FetchedProduct::defaultCategoryId),
	IgnoreNullable(FetchedProduct::defaultCombinationId),
	IgnoreNullable(FetchedProduct::defaultDisplayedPrice),
	IgnoreNullable(FetchedProduct::defaultDisplayedPriceFormatted),
	IgnoreNullable(FetchedProduct::description),
	IgnoreNullable(FetchedProduct::descriptionTranslated),
	IgnoreNullable(FetchedProduct::dimensions),
	IgnoreNullable(FetchedProduct::enabled),
	IgnoreNullable(FetchedProduct::favorites),
	IgnoreNullable(FetchedProduct::files),
	IgnoreNullable(FetchedProduct::galleryImages),
	IgnoreNullable(FetchedProduct::inStock),
	IgnoreNullable(FetchedProduct::isGiftCard),
	IgnoreNullable(FetchedProduct::isSampleProduct),
	IgnoreNullable(FetchedProduct::isShippingRequired),
	IgnoreNullable(FetchedProduct::media),
	IgnoreNullable(FetchedProduct::nameTranslated),
	IgnoreNullable(FetchedProduct::nameYourPriceEnabled),
	IgnoreNullable(FetchedProduct::customPriceTiers),
	IgnoreNullable(FetchedProduct::priceDefaultTier),
	IgnoreNullable(FetchedProduct::shippingPreparationTime),
	IgnoreNullable(FetchedProduct::showDeliveryTimeInStorefront),
	IgnoreNullable(FetchedProduct::options),
	IgnoreNullable(FetchedProduct::originalImage),
	IgnoreNullable(FetchedProduct::price),
	IgnoreNullable(FetchedProduct::priceInProductList),
	IgnoreNullable(FetchedProduct::productClassId),
	IgnoreNullable(FetchedProduct::quantity),
	IgnoreNullable(FetchedProduct::outOfStockVisibilityBehaviour),
	IgnoreNullable(FetchedProduct::relatedProducts),
	IgnoreNullable(FetchedProduct::ribbon),
	IgnoreNullable(FetchedProduct::ribbonTranslated),
	IgnoreNullable(FetchedProduct::seoDescription),
	IgnoreNullable(FetchedProduct::seoTitle),
	IgnoreNullable(FetchedProduct::shipping),
	IgnoreNullable(FetchedProduct::showOnFrontpage),
	IgnoreNullable(FetchedProduct::subscriptionSettings),
	IgnoreNullable(FetchedProduct::subtitle),
	IgnoreNullable(FetchedProduct::subtitleTranslated),
	IgnoreNullable(FetchedProduct::tax),
	IgnoreNullable(FetchedProduct::unlimited),
	IgnoreNullable(FetchedProduct::url),
	IgnoreNullable(FetchedProduct::warningLimit),
	IgnoreNullable(FetchedProduct::weight),
	IgnoreNullable(FetchedProduct::wholesalePrices),
	IgnoreNullable(FetchedProduct.AttributeValue::id),
	IgnoreNullable(FetchedProduct.AttributeValue::name),
	IgnoreNullable(FetchedProduct.AttributeValue::show),
	IgnoreNullable(FetchedProduct.AttributeValue::type),
	IgnoreNullable(FetchedProduct.AttributeValue::value),
	IgnoreNullable(FetchedProduct.FavoritesStats::count),
	IgnoreNullable(FetchedProduct.FavoritesStats::displayedCount),
	IgnoreNullable(FetchedProduct.GalleryImage::alt),
	IgnoreNullable(FetchedProduct.GalleryImage::thumbnail),
	AllowNullable(FetchedProduct.GalleryImage::borderInfo),
	IgnoreNullable(FetchedProduct.ProductDimensions::height),
	IgnoreNullable(FetchedProduct.ProductDimensions::length),
	IgnoreNullable(FetchedProduct.ProductDimensions::width),
	IgnoreNullable(FetchedProduct.ProductImage::image1500pxUrl),
	IgnoreNullable(FetchedProduct.ProductImage::image160pxUrl),
	IgnoreNullable(FetchedProduct.ProductImage::image400pxUrl),
	IgnoreNullable(FetchedProduct.ProductImage::image800pxUrl),
	IgnoreNullable(FetchedProduct.ProductImage::imageOriginalUrl),
	IgnoreNullable(FetchedProduct.ProductOption::type),
	IgnoreNullable(FetchedProduct.ProductOption.CheckboxOption::nameTranslated),
	IgnoreNullable(FetchedProduct.ProductOption.DateOption::nameTranslated),
	IgnoreNullable(FetchedProduct.ProductOption.FilesOption::nameTranslated),
	IgnoreNullable(FetchedProduct.ProductOption.RadioOption::nameTranslated),
	IgnoreNullable(FetchedProduct.ProductOption.SelectOption::nameTranslated),
	IgnoreNullable(FetchedProduct.ProductOption.SizeOption::nameTranslated),
	IgnoreNullable(FetchedProduct.ProductOption.TextAreaOption::nameTranslated),
	IgnoreNullable(FetchedProduct.ProductOption.TextFieldOption::nameTranslated),
	IgnoreNullable(FetchedProduct.ProductOptionChoice::textTranslated),
	IgnoreNullable(FetchedProduct.RelatedCategory::categoryId),
	IgnoreNullable(FetchedProduct.RelatedCategory::enabled),
	IgnoreNullable(FetchedProduct.RelatedCategory::productCount),
	IgnoreNullable(FetchedProduct.RelatedProducts::productIds),
	IgnoreNullable(FetchedProduct.RelatedProducts::relatedCategory),
	IgnoreNullable(FetchedProduct.Ribbon::color),
	IgnoreNullable(FetchedProduct.Ribbon::text),
	IgnoreNullable(FetchedProduct.ShippingSettings::disabledMethods),
	IgnoreNullable(FetchedProduct.ShippingSettings::enabledMethods),
	IgnoreNullable(FetchedProduct.ShippingSettings::flatRate),
	IgnoreNullable(FetchedProduct.ShippingSettings::methodMarkup),
	IgnoreNullable(FetchedProduct.ShippingSettings::type),
	AllowNullable(FetchedProduct::googleProductCategory),
	AllowNullable(FetchedProduct::googleProductCategoryName),
	AllowNullable(FetchedProduct::externalReferenceId),
	IgnoreNullable(FetchedProduct.RecurringChargeSettings::signUpFee),
	IgnoreNullable(FetchedProduct.RecurringChargeSettings::signUpFeeFormatted),
	AllowNullable(FetchedProduct.RecurringChargeSettings::subscriptionPriceWithSignUpFee),
	IgnoreNullable(FetchedProduct.RecurringChargeSettings::subscriptionPriceWithSignUpFeeFormatted),
	IgnoreNullable(FetchedProduct.SubscriptionSettings::oneTimePurchaseMarkup),
	IgnoreNullable(FetchedProduct.SubscriptionSettings::oneTimePurchaseMarkupFormatted),
	IgnoreNullable(FetchedProduct.SubscriptionSettings::oneTimePurchaseMarkupPercent),
	IgnoreNullable(FetchedProduct.SubscriptionSettings::oneTimePurchaseMarkupPercentFormatted),
	AllowNullable(FetchedProduct.SubscriptionSettings::oneTimePurchasePrice),
	IgnoreNullable(FetchedProduct.SubscriptionSettings::oneTimePurchasePriceFormatted)
)
