package tech.saintbassanaga.liveasy.config;

/*
 * MIT License
 *
 * Copyright (c) 2024 saintbassanaga
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "LiveAsy API",
                contact = @Contact(
                        name = "Us",
                        email = "saintbassanaga01@icloud.com",
                        url = ""
                ),
                description = "The Stock Manager project is a sophisticated web-based application " +
                        "designed to streamline inventory management for businesses of all sizes. " +
                        "It provides an intuitive platform for tracking stock levels,\n" +
                        " managing inventory, and generating insightful reports, " +
                        "facilitating efficient operations and informed decision-making.",
                version = "v1.1",
                license = @License(
                        name = "Copyright",
                        identifier = "tech.saintbassanaga",
                        url = "https://github.com/saintbassanaga/StockManager/blob/5ca6c6e6dd1df14cb0af10b874897cef040ea8f8/License.md"
                ),
                termsOfService = "Proprietary"
        )

)
public class SwaggerConfig {
}
