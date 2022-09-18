#Author:Edinson Morales

  @Stories

    Feature: New user registration on the Utest page
      @scenario1
      Scenario: Edinson registration on the Utest page
        Given Edinson wants to register on the Utest page
        When Enter all the required information
          | strName | strLastName | strEmail              | strMonthBirth | strDayBirth | strYearBirth | strCity | strPostalCode | strCountry | strPC   | strVersionPC | strLanguagePC | strSmartPhone | strSmartPhoneModel | strSmartPhone_So | strPassword  |
          | Edinson | Morales     | edinson2527@utest.com | January       | 16          | 2003         | Bogota  | 111141        | Colombia   | Windows | Windows11    | Spanish       | Apple         | iPhone             | iOS 2.0          | EdinsonDev25 |
        Then registration is completed successfully
          | strFinalText   |
          | Complete Setup |