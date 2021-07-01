const config = {
  env: '',
  url: '',
  proxy: false,
}

config.env = process.env.NODE_ENV

switch (config.env) {
  case 'production':
    config.url = ''
    config.proxy = false
    break
  case 'docker':
    config.url = ''
    config.proxy = {
      protocol: 'http',
      host: 'fame-nginx',
      port: 80,
    }
    break
  default:
    config.url = 'http://localhost:9091'
    config.proxy = false
}

export default config
