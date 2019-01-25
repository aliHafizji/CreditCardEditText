package com.alihafizji.library;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kauserali on 05/05/14.
 */
public class CreditCardPatterns implements CreditCardEditText.CreditCartEditTextInterface {

    private Context mContext;

    public CreditCardPatterns(Context context) {
        mContext = context;
    }

    @Override
    public List<CreditCardEditText.CreditCard> mapOfRegexStringAndImageResourceForCreditCardEditText(CreditCardEditText creditCardEditText) {
        List<CreditCardEditText.CreditCard> listOfPatterns = new ArrayList<CreditCardEditText.CreditCard>();

        CreditCardEditText.CreditCard visa = new CreditCardEditText.CreditCard("^4[0-9]{12}(?:[0-9]{3})?$", mContext.getResources().getDrawable(R.drawable.visa), CreditCardTypeEnum.VISA.cartType);
        CreditCardEditText.CreditCard mastercard = new CreditCardEditText.CreditCard("^5[1-5][0-9]{14}$", mContext.getResources().getDrawable(R.drawable.mastercard), CreditCardTypeEnum.MASTER_CARD.cartType);
        CreditCardEditText.CreditCard amex = new CreditCardEditText.CreditCard("^3[47][0-9]{13}$", mContext.getResources().getDrawable(R.drawable.amex), CreditCardTypeEnum.AMERICAN_EXPRESS.cartType);
        CreditCardEditText.CreditCard diners = new CreditCardEditText.CreditCard("^3(?:0[0-5]|[68][0-9])[0-9]{4,}$", mContext.getResources().getDrawable(R.drawable.icons_diners_club), CreditCardTypeEnum.DINERS_CLUB.cartType);
        CreditCardEditText.CreditCard rupay = new CreditCardEditText.CreditCard("^6[0-9]{15}$", mContext.getResources().getDrawable(R.drawable.icons_rupay), CreditCardTypeEnum.RUPAY_CARD.cartType);

        listOfPatterns.add(visa);
        listOfPatterns.add(mastercard);
        listOfPatterns.add(amex);
        return listOfPatterns;
    }
}
