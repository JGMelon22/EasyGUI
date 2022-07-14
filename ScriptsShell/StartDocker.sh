# Caso seu container do MSSQL possua um nome diferente, mude onde está escrito "SqlServer1" ;)
echo "Iniciando o Docker e o SQL Server..." &&sudo systemctl start docker && sudo docker start SqlServer1
