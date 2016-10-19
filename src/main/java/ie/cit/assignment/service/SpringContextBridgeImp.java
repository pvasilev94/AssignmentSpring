//package ie.cit.assignment.service;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//
///**
// * Created by Pavel on 19/10/2016.
// */
//@Component
//public class SpringContextBridgeImp implements SpringContextBridge, ApplicationContextAware {
//
//    private static ApplicationContext applicationContext;
//
//    @Autowired
//    private CitizenServiceImp service;
//
//    @SuppressWarnings("static-access")
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext)
//            throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//    public static SpringContextBridge services() {
//        return applicationContext.getBean(SpringContextBridge.class);
//    }
//
//    @Override
//    public CitizenService getService() {
//        return service;
//    }
//}
