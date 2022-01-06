    package com.epam.selenium.training.configuration;

    import org.apache.commons.configuration2.Configuration;
    import org.apache.commons.configuration2.builder.fluent.Configurations;
    import org.apache.commons.configuration2.ex.ConfigurationException;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

    import java.io.File;
    import java.text.MessageFormat;

    public abstract class ReadPropertyFile {

    private static final Logger LOG = LoggerFactory.getLogger(ReadPropertyFile.class);

    protected Configuration configuration;

    protected ReadPropertyFile(String nameProperties){
         Configurations configurations = new Configurations();
         try {
             this.configuration = configurations.properties(new File(nameProperties));
         }  catch (ConfigurationException e){
                LOG.info(e.getMessage(), e);
         }
    }

        public Configuration getConfiguration() {
            return configuration;
        }

        public String getValue(String key){
            return this.configuration.getString(key);
        }

        public String getValue(String key, Object... arguments){
            return MessageFormat.format(this.configuration.getString(key), arguments);
        }
    }
