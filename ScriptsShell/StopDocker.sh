# Caso seu container do MSSQL possua um nome diferente, mude onde está escrito "SqlServer1" ;)
echo "Parando o SQL Server e o Docker..." &&sudo docker stop SqlServer1 && sudo systemctl stop docker
