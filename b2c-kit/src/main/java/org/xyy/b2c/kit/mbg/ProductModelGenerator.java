package org.xyy.b2c.kit.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 生成 product 模块
 *
 * @author xyy
 * @version 1.0 2017/5/21.
 * @since 1.0
 */
public class ProductModelGenerator {
    private static String JAVA_MODE_PROJECT = "/Users/xyy/IdeaProjects/b2c/b2c-leaf/b2c-leaf-product/src/main/java";
    private static String JAVA_MODE_PACKAGE = "org.xyy.b2c.leaf.product.model";

    private static String JAVA_MAPPER_PATH = "/Users/xyy/IdeaProjects/b2c/b2c-root/b2c-root-product/src/main/java/";
    private static String JAVA_MAPPER_PACKAGE = "org.xyy.b2c.root.product.mapper";

    private static String SQL_MAP_FILE_PATH = "/Users/xyy/IdeaProjects/b2c/b2c-root/b2c-root-product/src/main/resources/";
    private static String SQL_MAP__FILE_PACKAGE = "mapper";


    public static void main(String[] args) throws Exception{

        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        File configFile = new File("/Users/xyy/IdeaProjects/b2c/b2c-kit/src/main/resources/generatorConfig_product.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);

        Configuration config = cp.parseConfiguration(configFile);

        config.getContext("product").getJavaModelGeneratorConfiguration().setTargetProject(JAVA_MODE_PROJECT);
        config.getContext("product").getJavaModelGeneratorConfiguration().setTargetPackage(JAVA_MODE_PACKAGE);

        config.getContext("product").getJavaClientGeneratorConfiguration().setTargetProject(JAVA_MAPPER_PATH);
        config.getContext("product").getJavaClientGeneratorConfiguration().setTargetPackage(JAVA_MAPPER_PACKAGE);

        config.getContext("product").getSqlMapGeneratorConfiguration().setTargetProject(SQL_MAP_FILE_PATH);
        config.getContext("product").getSqlMapGeneratorConfiguration().setTargetPackage(SQL_MAP__FILE_PACKAGE);

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
