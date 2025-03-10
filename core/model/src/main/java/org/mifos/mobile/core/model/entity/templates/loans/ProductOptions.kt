/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-mobile/blob/master/LICENSE.md
 */
package org.mifos.mobile.core.model.entity.templates.loans

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * Created by Rajan Maurya on 16/07/16.
 */

@Parcelize
data class ProductOptions(

    var id: Int? = null,

    var name: String? = null,

    var includeInBorrowerCycle: Boolean? = null,

    var useBorrowerCycle: Boolean? = null,

    @SerializedName("isLinkedToFloatingInterestRates")
    var linkedToFloatingInterestRates: Boolean? = null,

    @SerializedName("isFloatingInterestRateCalculationAllowed")
    var floatingInterestRateCalculationAllowed: Boolean? = null,

    var allowVariableInstallments: Boolean? = null,

    @SerializedName("isInterestRecalculationEnabled")
    var interestRecalculationEnabled: Boolean? = null,

    var canDefineInstallmentAmount: Boolean? = null,

    var holdGuaranteeFunds: Boolean? = null,

    var accountMovesOutOfNPAOnlyOnArrearsCompletion: Boolean? = null,
) : Parcelable
