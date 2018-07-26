package io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.presenter

import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.interactor.IAnotherCurrencyInteractorInput
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.interactor.IAnotherCurrencyInteractorPresenter
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.view.IAnotherCurrencyFragmentInput
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.view.IAnotherCurrencyFragmentPresenter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.MainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class AnotherCurrencyPresenter: BasePresenter<IAnotherCurrencyFragmentInput,
        /*IAnotherCurrencyInteractorInput,*/
        MainActivityRouterInput>(),
        IAnotherCurrencyFragmentPresenter/*,IAnotherCurrencyInteractorPresenter*/ {

//    override var interactor: IAnotherCurrencyInteractorInput? = null
//    override var view: IAnotherCurrencyFragmentInput? = null
//    override var router: AnotherCurrencyRouterInput? = null

}