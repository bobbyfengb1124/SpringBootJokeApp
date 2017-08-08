/**
 * @Author Feng Bo
 * @Date 8 Aug 2017 10:55:28 am
 */
package guru.springframework.joke.jokeapp.config;

import org.springframework.context.annotation.Bean;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * 
 */
public class ChuckConfiguration {

	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
