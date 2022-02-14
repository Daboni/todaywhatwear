import React from 'react';

import TabMenu from './TabMenu';

export default {
  title: 'Molecules/TabMenu',
  component: TabMenu,
};

export const Default = () => {
  return <TabMenu tabList={['최신순', '추천순', '인기순']} />;
};
