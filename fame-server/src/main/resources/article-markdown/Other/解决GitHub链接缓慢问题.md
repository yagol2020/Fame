通过代理或修改Hosts解决GitHub速度缓慢问题

## 代理
如果有代理可以通过以下命令解决
```shell
git config --global http.proxy="socks://127.0.0.1:1234"
git config --global https.proxy="socks5://127.0.0.1:1234"
```
取消代理
```shell
git config --global --unset http.proxy
git config --global --unset https.proxy
```

# 修改Host
```shell
nslookup github.global.ssl.fastly.Net
nslookup github.com
# 记录以上查询结果的2条IP
sudo vim /etc/hosts
# 插入IP记录
# :wq保存退出
```