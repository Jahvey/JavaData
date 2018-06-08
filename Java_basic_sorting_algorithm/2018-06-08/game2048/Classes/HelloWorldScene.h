#ifndef __HELLOWORLD_SCENE_H__
#define __HELLOWORLD_SCENE_H__

#include "cocos2d.h"
#include "Card.h"

class HelloWorld : public cocos2d::Layer
{
public:
    // there's no 'id' in cpp, so we recommend returning the class instance pointer
    static cocos2d::Scene* createScene();

    // Here's a difference. Method 'init' in cocos2d-x returns bool, instead of returning 'id' in cocos2d-iphone
    virtual bool init();
    
    // a selector callback
    void menuCloseCallback(cocos2d::Ref* pSender);
    
    // implement the "static create()" method manually
    CREATE_FUNC(HelloWorld);

	//加入手势识别的事件
	virtual bool onTouchBegan(cocos2d::Touch *t, cocos2d::Event *e);
	virtual void onTouchEnded(cocos2d::Touch *t, cocos2d::Event *e);
	bool doLeft();
	bool doRight();
	bool doUp();
	bool doDown();
	//自动卡片的生成
	void autoCreateCard();

	//判断游戏是否还能运行
	void doCheckGameOver();

private:
	int firstX, firstY, endX, endY;

	//创建卡片
	void createCard(cocos2d::Size size);
	//定义一个二维数组
	Card *cardArr[4][4];

	//游戏的分数
	int score;
	//定义显示分数的控件
	cocos2d::Label *scoreLabel;


};

#endif // __HELLOWORLD_SCENE_H__
