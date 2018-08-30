package org.gerry.customanno.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class reflectGetAnnotaionValue {

	public static void main(String[] args) throws Exception {
		Class<TestAnnotationUser> test = TestAnnotationUser.class;
		Annotation[] annos = test.getAnnotations();
		for (Annotation ann : annos) {
			
			Annotation anno = test.getAnnotation(ann.annotationType());
			System.out.println(anno.annotationType().getName());
			Method[] methods=ann.annotationType().getMethods();
			for(Method m:methods){
				System.out.println(m.getName());
			}
		}

	}
}
=======
package org.gerry.customanno.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class reflectGetAnnotaionValue {

	public static void main(String[] args) throws Exception {
		Class<TestAnnotationUser> test = TestAnnotationUser.class;
		Annotation[] annos = test.getAnnotations();
		for (Annotation ann : annos) {
			
			Annotation anno = test.getAnnotation(ann.annotationType());
			System.out.println(anno.annotationType().getName());
			Method[] methods=ann.annotationType().getMethods();
			for(Method m:methods){
				System.out.println(m.getName());
			}
		}

	}
}
