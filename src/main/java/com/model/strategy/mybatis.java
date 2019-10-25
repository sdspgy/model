package com.model.strategy;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * Author:   zhiqiu
 * Date:     2019-10-24
 */
public class mybatis {

	public static void main(String[] args) {
		//创建代码生成器
		AutoGenerator mpg = new AutoGenerator();
		//指定模板引擎  默认velocity
		//mpg.setTemplateEngine(new FreemarkerTemplateEngine());

		//全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setOpen(false);
		gc.setOutputDir("/Volumes/pgy/mybatis");
		gc.setFileOverride(true); //是否覆盖已有文件
		gc.setBaseResultMap(true); //XML是否需要BaseResultMap
		gc.setBaseColumnList(true); //XML是否显示字段
		gc.setControllerName("%sController");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setMapperName("%sMapper");
		gc.setXmlName("%sMapper");
		gc.setAuthor("yshexiaobai");
		gc.setIdType(IdType.AUTO);
		mpg.setGlobalConfig(gc);
		//数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUrl("jdbc:mysql://127.0.0.1:3306/access_manage?serverTimezone=CTT&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true");
		dsc.setUsername("root");
		dsc.setPassword("root");
		mpg.setDataSource(dsc);
		//策略配置
		StrategyConfig sc = new StrategyConfig();
		sc.setTablePrefix("tab_"); //表名前缀
		sc.setNaming(NamingStrategy.underline_to_camel); //表名生成策略
		sc.setEntityBuilderModel(true);
		sc.setEntityLombokModel(true);
		mpg.setStrategy(sc);
		//包配置
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.hxb");
		pc.setEntity("entity");
		pc.setController("controller");
		pc.setService("service");
		pc.setServiceImpl("serviceImpl");
		pc.setMapper("mapper");
		pc.setXml("mapper");
		mpg.setPackageInfo(pc);

		mpg.execute();
	}

}
