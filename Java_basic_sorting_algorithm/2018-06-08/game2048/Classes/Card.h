#ifndef __Card_H__
#define __Card_H__


#include <iostream>
#include "cocos2d.h"

USING_NS_CC;

class Card :public Sprite
{
public:
	static Card *createSprite(int num, int width, int height, float x, float y);
	virtual bool init();
	CREATE_FUNC(Card);
	//或取数字
	int getNumber();
	//设置数字
	void setNumber(int num);
private:
	//显示在界面的数字
	int number;
	void enemyInit(int num, int width, int height, float x, float y);
	//定义显示数字的控件
	Label *labelNum;
	//显示背景
	LayerColor *layerColorBg;


};



#endif __Card_H__