
/*

   Autogenerated by CAP duplicate fixer v1.0.0 at 07-04-2022 05:14:03.

   Locations of Issue Instances ( File, [StartLine:StartColumn ~ EndLine:EndColumn] ):

   inject/src/main/java/io/micronaut/inject/beans/visitor/BeanIntrospectionWriter.java , [782:9~784:27]
   inject/src/main/java/io/micronaut/inject/beans/visitor/BeanIntrospectionWriter.java , [683:9~685:31]
   inject/src/main/java/io/micronaut/inject/beans/visitor/BeanIntrospectionWriter.java , [414:9~416:31]
   inject/src/main/java/io/micronaut/inject/beans/visitor/BeanIntrospectionWriter.java , [831:9~833:27]
   inject/src/main/java/io/micronaut/inject/writer/ExecutableMethodsDefinitionWriter.java , [260:9~262:31]
   inject/src/main/java/io/micronaut/inject/writer/ExecutableMethodsDefinitionWriter.java , [352:9~354:31]

*/


package io.micronaut.inject;

import org.objectweb.asm.commons.GeneratorAdapter;

public final class ExtractedSeparateClass82360 {
    private ExtractedSeparateClass82360() {
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }
    
    public static void extractedMethod67805(final GeneratorAdapter writer, final int DEFAULT_MAX_STACK) {
        writer.returnValue();
        writer.visitMaxs(DEFAULT_MAX_STACK, 1);
        writer.visitEnd();
    }
}
