#include "Card.h"


USING_NS_CC;

Card *Card::createSprite(int num, int width, int height, float x, float y)
{
	Card *card = new Card();
	if (card && card->init())
	{
		card->enemyInit(num, width, height, x, y);
		return card;
	}

	CC_SAFE_DELETE(card);
	return nullptr;
}

bool Card::init()
{
	if (!Sprite::init())
	{
		return false;
	}
	return true;
}


int Card::getNumber()
{
	return number;
}

void Card::setNumber(int num)
{
	number = num;
	//判断数字大小
	if (number >= 0)
	{
		labelNum->setSystemFontSize(100);
	}
	else if (number >= 16)
	{
		labelNum->setSystemFontSize(90);
	}
	else if (number >= 128)
	{
		labelNum->setSystemFontSize(60);
	}
	else if (number >= 1024)
	{
		labelNum->setSystemFontSize(40);
	}

	if (number == 0)
	{
		layerColorBg->setColor(cocos2d::Color3B(200, 190, 180));
	}
	if (number == 2)
	{
		layerColorBg->setColor(cocos2d::Color3B(240, 230, 220));
	}
	if (number == 4)
	{
		layerColorBg->setColor(cocos2d::Color3B(240, 220, 200));
	}
	if (number == 8)
	{
		layerColorBg->setColor(cocos2d::Color3B(240, 180, 120));
	}
	if (number == 16)
	{
		layerColorBg->setColor(cocos2d::Color3B(240, 140, 90));
	}
	if (number == 32)
	{
		layerColorBg->setColor(cocos2d::Color3B(240, 120, 90));
	}
	if (number == 64)
	{
		layerColorBg->setColor(cocos2d::Color3B(240, 90, 60));
	}
	if (number == 128)
	{
		layerColorBg->setColor(cocos2d::Color3B(240, 90, 60));
	}
	if (number == 256)
	{
		layerColorBg->setColor(cocos2d::Color3B(240, 200, 70));
	}
	if (number == 512)
	{
		layerColorBg->setColor(cocos2d::Color3B(240, 200, 70));
	}
	if (number == 1024)
	{
		layerColorBg->setColor(cocos2d::Color3B(0, 130, 0));
	}
	if (number == 2048)
	{
		layerColorBg->setColor(cocos2d::Color3B(0, 130, 0));
	}


	if (number>0)
	{
		labelNum->setString(__String::createWithFormat("%i", num)->getCString());
	}
	else
	{
		labelNum->setString("");
	}
}

void Card::enemyInit(int num, int width, int height, float x, float y)
{
	number = num;
	//加入卡片的背景颜色
	layerColorBg = LayerColor::create(Color4B(200, 199, 180, 255), width - 15, height - 15);
	layerColorBg->setPosition(x, y);
	//判断如果不等于0就显示
	if (number>0)
	{
		labelNum = Label::create(__String::createWithFormat("%i", number)->getCString(), "Arial", 100);
		labelNum->setPosition(Point(layerColorBg->getContentSize().width / 2, layerColorBg->getContentSize().height / 2));
		layerColorBg->addChild(labelNum);
	}
	else
	{
		labelNum = Label::create("", "Arial", 100);
		labelNum->setPosition(Point(layerColorBg->getContentSize().width / 2, layerColorBg->getContentSize().height / 2));
		layerColorBg->addChild(labelNum);
	}
	this->addChild(layerColorBg);
}