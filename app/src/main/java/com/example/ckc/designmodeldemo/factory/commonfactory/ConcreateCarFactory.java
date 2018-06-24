package com.example.ckc.designmodeldemo.factory.commonfactory;

/**
 * Created by ckc on 18-6-19.
 */
//具体汽车工厂
public class ConcreateCarFactory extends CarFactory {

    @Override
    public <T extends CarProduct> T createProduct(Class<T> clz) {
        CarProduct product = null;
        try {
            // 利用反射+泛型灵活 不需要多个工厂实现类
            product= (CarProduct) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
