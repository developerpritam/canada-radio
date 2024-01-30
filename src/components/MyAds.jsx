import { View } from 'react-native'
import React from 'react'
import { BannerAd, BannerAdSize } from 'react-native-google-mobile-ads';
import { globalStyle } from '../globalStyle';
const adUnitId = 'ca-app-pub-5603289619370435/8280538672';

const MyAds = () => {
  return (
    <View style={globalStyle.container}>
      <BannerAd
        unitId={adUnitId}
        size={BannerAdSize.BANNER}
        requestOptions={{
          requestNonPersonalizedAdsOnly: false,
        }}
      />
    </View>
  );
};

export default MyAds
