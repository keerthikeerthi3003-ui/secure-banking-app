# SecureBank – Secure Digital Banking Application

SecureBank is a two-tier digital banking project built using Java 21 and Spring Boot. The application is designed for secure deployment on Microsoft Azure using private networking and an Azure DevOps CI/CD pipeline.

## Project Objective

Deploy a secure digital banking application on Azure with controlled network access, private endpoints, managed identity, Azure Key Vault, Azure SQL Database, monitoring and automated deployment.

## Technologies

- Java 21
- Spring Boot
- Maven
- HTML5
- CSS3
- JavaScript
- Git and GitHub
- Microsoft Azure
- Azure DevOps
## Application Features

## Architecture

The following diagram shows the secure two-tier Azure architecture designed for this application.

![SecureBank Azure Architecture](architecture/securebank-azure-architecture.png)
## Application Features

- Responsive banking homepage
- Customer login demonstration
- Customer account dashboard
- Account balance cards
- Recent transaction history
- Money-transfer review form
- Spring Boot REST API
- Maven build and packaging

## API Endpoints


### Application status

```text
GET /api/status
```

### Customer accounts

```text
GET /api/accounts
```
## Project Structure

```text
secure-banking-app/
├── architecture/
│   └── securebank-azure-architecture.png
├── src/
│   ├── main/
│   │   ├── java/com/securebank/bankingapp/
│   │   │   ├── BankingappApplication.java
│   │   │   └── controller/BankingController.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── index.html
│   │       │   ├── login.html
│   │       │   ├── dashboard.html
│   │       │   ├── transfer.html
│   │       │   └── style.css
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## Screenshots

Project screenshots will include:

- Banking homepage
- Customer login page
- Account dashboard
- Money-transfer page
- Java REST API output
- Azure resource configuration
- CI/CD pipeline deployment
- Monitoring and security validation

## Future Enhancements

- Connect the application to Azure SQL Database
- Add Microsoft Entra ID authentication
- Store secrets in Azure Key Vault
- Add server-side transaction processing
- Add account statements and bill payments
- Deploy through Azure DevOps CI/CD
- Add automated tests and security scanning

## References

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Microsoft Azure Documentation](https://learn.microsoft.com/azure/)
- [Azure App Service Documentation](https://learn.microsoft.com/azure/app-service/)
- [Azure SQL Documentation](https://learn.microsoft.com/azure/azure-sql/)
- [GitHub Markdown Guide](https://guides.github.com/features/mastering-markdown/)

## License

This project is created for educational and demonstration purposes.

## Contact

- **Author:** Keerthi Kannan
- **GitHub:** [keerthikeerthi3003-ui](https://github.com/keerthikeerthi3003-ui)